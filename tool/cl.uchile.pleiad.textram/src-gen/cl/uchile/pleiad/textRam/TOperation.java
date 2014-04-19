/**
 */
package cl.uchile.pleiad.textRam;

import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.Visibility;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TOperation#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TOperation#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TOperation#isPartialReturnType <em>Partial Return Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TOperation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TOperation#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOperation()
 * @model
 * @generated
 */
public interface TOperation extends TClassMember
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOperation_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TOperation#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link ca.mcgill.cs.sel.ram.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.Visibility
   * @see #setVisibility(Visibility)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOperation_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TOperation#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see ca.mcgill.cs.sel.ram.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

  /**
   * Returns the value of the '<em><b>Partial Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Return Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Return Type</em>' attribute.
   * @see #setPartialReturnType(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOperation_PartialReturnType()
   * @model
   * @generated
   */
  boolean isPartialReturnType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TOperation#isPartialReturnType <em>Partial Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Return Type</em>' attribute.
   * @see #isPartialReturnType()
   * @generated
   */
  void setPartialReturnType(boolean value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' reference.
   * @see #setReturnType(Type)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOperation_ReturnType()
   * @model
   * @generated
   */
  Type getReturnType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TOperation#getReturnType <em>Return Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(Type value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTOperation_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<TParameter> getParameters();

} // TOperation
