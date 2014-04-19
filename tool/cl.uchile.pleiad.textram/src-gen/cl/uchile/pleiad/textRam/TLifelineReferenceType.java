/**
 */
package cl.uchile.pleiad.textRam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TLifeline Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cl.uchile.pleiad.textRam.TextRamPackage#getTLifelineReferenceType()
 * @model
 * @generated
 */
public enum TLifelineReferenceType implements Enumerator
{
  /**
   * The '<em><b>Reference</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REFERENCE_VALUE
   * @generated
   * @ordered
   */
  REFERENCE(0, "reference", "ref"),

  /**
   * The '<em><b>Association</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSOCIATION_VALUE
   * @generated
   * @ordered
   */
  ASSOCIATION(1, "association", "assoc"),

  /**
   * The '<em><b>Attribute</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATTRIBUTE_VALUE
   * @generated
   * @ordered
   */
  ATTRIBUTE(2, "attribute", "attr");

  /**
   * The '<em><b>Reference</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Reference</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REFERENCE
   * @model name="reference" literal="ref"
   * @generated
   * @ordered
   */
  public static final int REFERENCE_VALUE = 0;

  /**
   * The '<em><b>Association</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Association</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSOCIATION
   * @model name="association" literal="assoc"
   * @generated
   * @ordered
   */
  public static final int ASSOCIATION_VALUE = 1;

  /**
   * The '<em><b>Attribute</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Attribute</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTRIBUTE
   * @model name="attribute" literal="attr"
   * @generated
   * @ordered
   */
  public static final int ATTRIBUTE_VALUE = 2;

  /**
   * An array of all the '<em><b>TLifeline Reference Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TLifelineReferenceType[] VALUES_ARRAY =
    new TLifelineReferenceType[]
    {
      REFERENCE,
      ASSOCIATION,
      ATTRIBUTE,
    };

  /**
   * A public read-only list of all the '<em><b>TLifeline Reference Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TLifelineReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TLifeline Reference Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TLifelineReferenceType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TLifelineReferenceType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TLifeline Reference Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TLifelineReferenceType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TLifelineReferenceType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TLifeline Reference Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TLifelineReferenceType get(int value)
  {
    switch (value)
    {
      case REFERENCE_VALUE: return REFERENCE;
      case ASSOCIATION_VALUE: return ASSOCIATION;
      case ATTRIBUTE_VALUE: return ATTRIBUTE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TLifelineReferenceType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TLifelineReferenceType
