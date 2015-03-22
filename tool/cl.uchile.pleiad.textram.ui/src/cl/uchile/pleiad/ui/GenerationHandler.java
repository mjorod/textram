package cl.uchile.pleiad.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import ca.mcgill.cs.sel.ram.Aspect;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.util.TextRamModelUtil;

import com.google.inject.Inject;
import com.google.inject.Provider;

/*see http://wiki.eclipse.org/FAQ_How_do_I_open_an_editor_on_something_that_is_not_a_file%3F*/
public class GenerationHandler extends AbstractHandler implements IHandler {

	@Inject
	private IGenerator generator;

	@Inject
	private Provider fileAccessProvider;

	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell s = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();

		FileDialog dialog = new FileDialog(s, SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*.ram" });

		String result = dialog.open();

		Aspect ramAspect = TextRamModelUtil.loadModelFromFile(result);
		TAspect textRamAspect = TextRamModelUtil
				.transformToTextRamAspect(ramAspect);
		String content = TextRamModelUtil.serialize(textRamAspect);

		if (content == null) {
			return null;
		}

		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IStorage storage = new StringStorage( textRamAspect.getName(), content);
		IStorageEditorInput input = new StringInput(storage);
		IWorkbenchPage page = window.getActivePage();
		if (page != null) {
			try {
				IEditorPart e =  page.findEditor(input);
				return page.openEditor(input,
						"org.eclipse.ui.DefaultTextEditor");
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;

	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	class StringStorage implements IStorage {
		private String string;
		private String name;

		StringStorage(String name, String input) {
			this.string = input;
			this.name = name;
		}

		public InputStream getContents() throws CoreException {
			return new ByteArrayInputStream(string.getBytes());
		}

		public IPath getFullPath() {
			return null;
		}

		public Object getAdapter(Class adapter) {
			return null;
		}

		public String getName() {
			return this.name + ".xram";
		}

		public boolean isReadOnly() {
			return true;
		}
	}

	class StringInput implements IStorageEditorInput {
		private IStorage storage;

		StringInput(IStorage storage) {
			this.storage = storage;
		}

		public boolean exists() {
			return true;
		}

		public ImageDescriptor getImageDescriptor() {
			return null;
		}

		public String getName() {
			return storage.getName();
		}

		public IPersistableElement getPersistable() {
			return null;
		}

		public IStorage getStorage() {
			return storage;
		}

		public String getToolTipText() {
			return "String-based file: " + storage.getName();
		}

		public Object getAdapter(Class adapter) {
			return null;
		}
	}
}
