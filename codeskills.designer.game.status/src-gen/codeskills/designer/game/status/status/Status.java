/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.status.status;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codeskills.designer.game.status.status.Status#isComplete <em>Complete</em>}</li>
 *   <li>{@link codeskills.designer.game.status.status.Status#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @see codeskills.designer.game.status.status.StatusPackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends EObject
{
  /**
   * Returns the value of the '<em><b>Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complete</em>' attribute.
   * @see #setComplete(boolean)
   * @see codeskills.designer.game.status.status.StatusPackage#getStatus_Complete()
   * @model
   * @generated
   */
  boolean isComplete();

  /**
   * Sets the value of the '{@link codeskills.designer.game.status.status.Status#isComplete <em>Complete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Complete</em>' attribute.
   * @see #isComplete()
   * @generated
   */
  void setComplete(boolean value);

  /**
   * Returns the value of the '<em><b>Milliseconds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Milliseconds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Milliseconds</em>' attribute.
   * @see #setMilliseconds(long)
   * @see codeskills.designer.game.status.status.StatusPackage#getStatus_Milliseconds()
   * @model
   * @generated
   */
  long getMilliseconds();

  /**
   * Sets the value of the '{@link codeskills.designer.game.status.status.Status#getMilliseconds <em>Milliseconds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Milliseconds</em>' attribute.
   * @see #getMilliseconds()
   * @generated
   */
  void setMilliseconds(long value);

} // Status
