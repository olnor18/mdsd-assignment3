/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.MathExp#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp()
 * @model
 * @generated
 */
public interface MathExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Assignment)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getMathExp_Value()
   * @model containment="true"
   * @generated
   */
  Assignment getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.MathExp#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Assignment value);

} // MathExp
