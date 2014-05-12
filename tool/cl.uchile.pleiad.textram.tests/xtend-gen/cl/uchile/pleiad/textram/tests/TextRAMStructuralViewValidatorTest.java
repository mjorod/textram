package cl.uchile.pleiad.textram.tests;

import ca.mcgill.cs.sel.ram.Aspect;
import cl.uchile.pleiad.TextRAMTestsInjectorProvider;
import cl.uchile.pleiad.textRam.TextRamPackage;
import cl.uchile.pleiad.validation.TextRAMValidator;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
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
public class TextRAMStructuralViewValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Aspect> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testDuplicateAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int attribute");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("boolean attribute");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      EClass _tClassMember = TextRamPackage.eINSTANCE.getTClassMember();
      this._validationTestHelper.assertError(_parse, _tClassMember, 
        TextRAMValidator.DUPLICATE_ELEMENT, 
        "Duplicate member \'attribute\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C {}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      EClass _tClass = TextRamPackage.eINSTANCE.getTClass();
      this._validationTestHelper.assertError(_parse, _tClass, 
        TextRAMValidator.DUPLICATE_CLASS, 
        "Duplicate class \'C\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateOperations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operation(int a)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ int  operation(int b)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      EClass _tOperation = TextRamPackage.eINSTANCE.getTOperation();
      this._validationTestHelper.assertError(_parse, _tOperation, 
        TextRAMValidator.DUPLICATE_ELEMENT, 
        "Duplicate member \'operation\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
