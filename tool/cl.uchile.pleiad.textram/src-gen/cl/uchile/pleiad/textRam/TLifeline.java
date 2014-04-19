/**
 */
package cl.uchile.pleiad.textRam;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cl.uchile.pleiad.textRam.TLifeline#isStatic <em>Static</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TLifeline#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TLifeline#getRepresents <em>Represents</em>}</li>
 *   <li>{@link cl.uchile.pleiad.textRam.TLifeline#getLocalProperties <em>Local Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLifeline()
 * @model
 * @generated
 */
public interface TLifeline extends TValueSpecification, TMessageAssignableFeature
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLifeline_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TLifeline#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
   * The literals are from the enumeration {@link cl.uchile.pleiad.textRam.TLifelineReferenceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Type</em>' attribute.
   * @see cl.uchile.pleiad.textRam.TLifelineReferenceType
   * @see #setReferenceType(TLifelineReferenceType)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLifeline_ReferenceType()
   * @model
   * @generated
   */
  TLifelineReferenceType getReferenceType();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TLifeline#getReferenceType <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Type</em>' attribute.
   * @see cl.uchile.pleiad.textRam.TLifelineReferenceType
   * @see #getReferenceType()
   * @generated
   */
  void setReferenceType(TLifelineReferenceType value);

  /**
   * Returns the value of the '<em><b>Represents</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Represents</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Represents</em>' reference.
   * @see #setRepresents(TTypedElement)
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLifeline_Represents()
   * @model
   * @generated
   */
  TTypedElement getRepresents();

  /**
   * Sets the value of the '{@link cl.uchile.pleiad.textRam.TLifeline#getRepresents <em>Represents</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Represents</em>' reference.
   * @see #getRepresents()
   * @generated
   */
  void setRepresents(TTypedElement value);

  /**
   * Returns the value of the '<em><b>Local Properties</b></em>' containment reference list.
   * The list contents are of type {@link cl.uchile.pleiad.textRam.TTemporaryProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Properties</em>' containment reference list.
   * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLifeline_LocalProperties()
   * @model containment="true"
   * @generated
   */
  EList<TTemporaryProperty> getLocalProperties();

} // TLifeline
