/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.status.status;

import codeskills.designer.game.game.Level;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codeskills.designer.game.status.status.LevelS#getLevel <em>Level</em>}</li>
 *   <li>{@link codeskills.designer.game.status.status.LevelS#isIsCurrent <em>Is Current</em>}</li>
 *   <li>{@link codeskills.designer.game.status.status.LevelS#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see codeskills.designer.game.status.status.StatusPackage#getLevelS()
 * @model
 * @generated
 */
public interface LevelS extends S
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' reference.
   * @see #setLevel(Level)
   * @see codeskills.designer.game.status.status.StatusPackage#getLevelS_Level()
   * @model
   * @generated
   */
  Level getLevel();

  /**
   * Sets the value of the '{@link codeskills.designer.game.status.status.LevelS#getLevel <em>Level</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' reference.
   * @see #getLevel()
   * @generated
   */
  void setLevel(Level value);

  /**
   * Returns the value of the '<em><b>Is Current</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Current</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Current</em>' attribute.
   * @see #setIsCurrent(boolean)
   * @see codeskills.designer.game.status.status.StatusPackage#getLevelS_IsCurrent()
   * @model
   * @generated
   */
  boolean isIsCurrent();

  /**
   * Sets the value of the '{@link codeskills.designer.game.status.status.LevelS#isIsCurrent <em>Is Current</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Current</em>' attribute.
   * @see #isIsCurrent()
   * @generated
   */
  void setIsCurrent(boolean value);

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link codeskills.designer.game.status.status.GroupS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see codeskills.designer.game.status.status.StatusPackage#getLevelS_Groups()
   * @model containment="true"
   * @generated
   */
  EList<GroupS> getGroups();

} // LevelS