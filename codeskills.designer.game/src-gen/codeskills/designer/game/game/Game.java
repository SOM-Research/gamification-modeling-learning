/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codeskills.designer.game.game.Game#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @see codeskills.designer.game.game.GamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject
{
  /**
   * Returns the value of the '<em><b>Levels</b></em>' containment reference list.
   * The list contents are of type {@link codeskills.designer.game.game.Level}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Levels</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Levels</em>' containment reference list.
   * @see codeskills.designer.game.game.GamePackage#getGame_Levels()
   * @model containment="true"
   * @generated
   */
  EList<Level> getLevels();

} // Game