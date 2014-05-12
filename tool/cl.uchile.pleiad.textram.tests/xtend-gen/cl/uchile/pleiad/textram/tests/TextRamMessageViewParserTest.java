package cl.uchile.pleiad.textram.tests;

import ca.mcgill.cs.sel.ram.Aspect;
import cl.uchile.pleiad.TextRAMTestsInjectorProvider;
import com.google.inject.Inject;
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
public class TextRamMessageViewParserTest {
  @Inject
  @Extension
  private ParseHelper<Aspect> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testReturnMessage() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class A1 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operationA1_1()");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ void operationA1_2()");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ int operationA1_3()");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class B1 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ int operationB1_1()");
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
      _builder.append("ref a1:A1 { int result }");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("ref b1:B1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("messageView A1.operationA1_1() {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("a1 => a1 { result := operationA1_3() }");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("opt [\"result == null\"] {");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("a1 => b1 { result := operationB1_1() }");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("return result");
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
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
