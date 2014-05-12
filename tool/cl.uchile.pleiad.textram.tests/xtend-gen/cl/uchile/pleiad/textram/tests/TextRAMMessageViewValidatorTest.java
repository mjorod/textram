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
public class TextRAMMessageViewValidatorTest {
  @Inject
  @Extension
  private ParseHelper<Aspect> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testValidNumberOfArgumentsForOperationOnInteraction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C1 { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operation()");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C2 { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void start(int a, int b, int c)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("messages {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("lifelines {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ref c1:C1");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ref c2:C2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("messageView C1.operation() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("c1 => c2 { start(a, b) }");
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
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      EClass _tMessage = TextRamPackage.eINSTANCE.getTMessage();
      this._validationTestHelper.assertError(_parse, _tMessage, 
        TextRAMValidator.INVALID_ARGUMENTS, 
        "Invalid arguments on \'start\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidArgumentsForOverloadedOperationOnInteraction() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C1 { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operation()");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C2 { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void start(int a, int b, int c)");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void start(boolean x, boolean y)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("messages {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("lifelines {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ref c1:C1");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ref c2:C2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("messageView C1.operation() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("c1 => c2 { start(a, b) }");
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
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      EClass _tMessage = TextRamPackage.eINSTANCE.getTMessage();
      this._validationTestHelper.assertError(_parse, _tMessage, 
        TextRAMValidator.INVALID_ARGUMENTS, 
        "Invalid arguments on \'start\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testArgumentsOnMessageViewHeader() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C1 { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operation(int x, int y)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C2 { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void start(int a, int b, int c)");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("messages {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("lifelines {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ref c1:C1");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ref c2:C2");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("messageView C1.operation(y) {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("c1 => c2 { start(a, b, c) }");
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
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      EClass _tMessageView = TextRamPackage.eINSTANCE.getTMessageView();
      this._validationTestHelper.assertError(_parse, _tMessageView, 
        TextRAMValidator.INVALID_ARGUMENTS, 
        "Invalid arguments on \'operation\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
