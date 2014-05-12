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
public class TextRAMStructuralViewParserTest {
  @Inject
  @Extension
  private ParseHelper<Aspect> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testAspectWithOneClassWithoutMembers() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { structure {  class C{} } }");
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOperationWithOneParameter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C1 {");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("- int operation(int parm1)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("    ");
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
  
  @Test
  public void testOperationWithAListOfParameter() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C1 {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("-  int operation(int parm1, char parm2, boolean parm3)        ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("    ");
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
  
  @Test
  public void testParameterTypeOfExistingClass() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class C1 {");
      _builder.newLine();
      _builder.append("\t        \t\t");
      _builder.append("-  int operation(ExistingClass parm1, char parm2, ExistingClass parm3)");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class ExistingClass {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
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
  
  @Test
  public void testAspectWithOneClassWithOnlyAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("structure { ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("int a");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("int b");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAspectWithOneClassWithOnlyOperations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("structure { ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("+ int operation()");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("- boolean operation2()");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testClassWithMethodsOverloading() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("structure { ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("+ int operation(int a1, int b1)");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("- int operation(boolean a1)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLayouts() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("structure { ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("@@x= 123");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("@@y= 312");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class C {} ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBidirectionalAssociations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class A {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class B {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("associations {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("A & B { myABBA }");
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
  
  @Test
  public void testAssociationBetweenClasses() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class From {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class To {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("associations {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("0..0 From -> 0..1 To { mySubject }");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t\t");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValueConverterForManyMultiplicityOnUpperBound() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class From {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class To {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("associations {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("0..* From -> 0..* To { mySubject }");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t\t");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOptionalLowerBoundOnFromAssociation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class From {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class To {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("associations {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("1 From -> 1..1 To { mySubject }");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t\t");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOptionalLowerBoundOnToAssociation() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class From {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class To {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("associations {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("1..* From -> 1 To { mySubject }");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t\t");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAssociationWithoutLowerBoundAndUpperBound() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class From {}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class To {}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("associations {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("From -> To { mySubject }");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t\t");
      _builder.newLine();
      Aspect _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOneSuperType() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class Super {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("int myInt");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class Derived : Super {");
      _builder.newLine();
      _builder.append("\t\t\t");
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
  
  @Test
  public void testRSet() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("aspect A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("structure {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class |MyClass {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ Set<String> getStringType()");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ Set<int> getIntType()");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("class AnotherClass {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("+ Set<MyClass> getPartialClass()");
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
