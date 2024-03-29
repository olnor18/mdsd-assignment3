/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalUse#getRef <em>Ref</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.ExternalUse#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalUse()
 * @model
 * @generated
 */
public interface ExternalUse extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(External)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalUse_Ref()
   * @model
   * @generated
   */
  External getRef();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.ExternalUse#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(External value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.math.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getExternalUse_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getParameters();

} // ExternalUse
