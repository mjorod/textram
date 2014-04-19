/**
 */
package cl.uchile.pleiad.textRam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAbstract Messages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessages#isCreate <em>Create</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessages#isPartialClass <em>Partial Class</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessages#getClass_ <em>Class</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessages#isPartialOperation <em>Partial Operation</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessages#getSpecifies <em>Specifies</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessages#getArguments <em>Arguments</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TAbstractMessages#getInteractionMessages <em>Interaction Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages()
 * @model
 * @generated
 */
public interface TAbstractMessages extends EObject
{
  /**
   * Returns the value of the '<em><b>Create</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create</em>' attribute.
   * @see #setCreate(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages_Create()
   * @model
   * @generated
   */
  boolean isCreate();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAbstractMessages#isCreate <em>Create</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create</em>' attribute.
   * @see #isCreate()
   * @generated
   */
  void setCreate(boolean value);

  /**
   * Returns the value of the '<em><b>Partial Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Class</em>' attribute.
   * @see #setPartialClass(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages_PartialClass()
   * @model
   * @generated
   */
  boolean isPartialClass();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAbstractMessages#isPartialClass <em>Partial Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Class</em>' attribute.
   * @see #isPartialClass()
   * @generated
   */
  void setPartialClass(boolean value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' reference.
   * @see #setClass(TClass)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages_Class()
   * @model
   * @generated
   */
  TClass getClass_();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAbstractMessages#getClass_ <em>Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(TClass value);

  /**
   * Returns the value of the '<em><b>Partial Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Operation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partial Operation</em>' attribute.
   * @see #setPartialOperation(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages_PartialOperation()
   * @model
   * @generated
   */
  boolean isPartialOperation();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAbstractMessages#isPartialOperation <em>Partial Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partial Operation</em>' attribute.
   * @see #isPartialOperation()
   * @generated
   */
  void setPartialOperation(boolean value);

  /**
   * Returns the value of the '<em><b>Specifies</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifies</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifies</em>' reference.
   * @see #setSpecifies(TOperation)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages_Specifies()
   * @model
   * @generated
   */
  TOperation getSpecifies();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TAbstractMessages#getSpecifies <em>Specifies</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specifies</em>' reference.
   * @see #getSpecifies()
   * @generated
   */
  void setSpecifies(TOperation value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages_Arguments()
   * @model
   * @generated
   */
  EList<TParameter> getArguments();

  /**
   * Returns the value of the '<em><b>Interaction Messages</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TInteraction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction Messages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction Messages</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTAbstractMessages_InteractionMessages()
   * @model containment="true"
   * @generated
   */
  EList<TInteraction> getInteractionMessages();

} // TAbstractMessages
