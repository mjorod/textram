package cl.uchile.pleiad.textram.tests;

import ca.mcgill.cs.sel.ram.Aspect;
import cl.uchile.pleiad.TextRAMTestsInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(TextRAMTestsInjectorProvider.class)
@SuppressWarnings("all")
public class TextRamScopeProviderTest {
  @Inject
  @Extension
  private ParseHelper<Aspect> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testVisibilityOfExtendedClassesAndOperationsOnMessageView() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class B1 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operationB1_1()");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operationB1_2()");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("- void operationB1_3()");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      final Aspect aspectB = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("aspect A extends B {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("structure {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("class A1 {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("+ void operationA1_1()");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("messages {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("lifelines {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref a1:A1");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("ref b1:B1");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("messageView B1.operationB1_1() {");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("a1 => b1 { operationB1_1() }");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("b1 => b1 { operationB1_2() }");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      Resource _eResource = aspectB.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      Aspect _parse = this._parseHelper.parse(_builder_1, _resourceSet);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
