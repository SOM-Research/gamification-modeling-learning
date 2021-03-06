/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data.data.impl;

import codeskills.designer.data.data.DataPackage;
import codeskills.designer.data.data.File;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codeskills.designer.data.data.impl.FileImpl#getExt <em>Ext</em>}</li>
 *   <li>{@link codeskills.designer.data.data.impl.FileImpl#isChanged <em>Changed</em>}</li>
 *   <li>{@link codeskills.designer.data.data.impl.FileImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends ResourceImpl implements File
{
  /**
   * The default value of the '{@link #getExt() <em>Ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExt()
   * @generated
   * @ordered
   */
  protected static final String EXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExt() <em>Ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExt()
   * @generated
   * @ordered
   */
  protected String ext = EXT_EDEFAULT;

  /**
   * The default value of the '{@link #isChanged() <em>Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChanged()
   * @generated
   * @ordered
   */
  protected static final boolean CHANGED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isChanged() <em>Changed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChanged()
   * @generated
   * @ordered
   */
  protected boolean changed = CHANGED_EDEFAULT;

  /**
   * The cached value of the '{@link #getModel() <em>Model</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModel()
   * @generated
   * @ordered
   */
  protected EList<EObject> model;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DataPackage.Literals.FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExt()
  {
    return ext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExt(String newExt)
  {
    String oldExt = ext;
    ext = newExt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.FILE__EXT, oldExt, ext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isChanged()
  {
    return changed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChanged(boolean newChanged)
  {
    boolean oldChanged = changed;
    changed = newChanged;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.FILE__CHANGED, oldChanged, changed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getModel()
  {
    if (model == null)
    {
      model = new EObjectResolvingEList<EObject>(EObject.class, this, DataPackage.FILE__MODEL);
    }
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DataPackage.FILE__EXT:
        return getExt();
      case DataPackage.FILE__CHANGED:
        return isChanged();
      case DataPackage.FILE__MODEL:
        return getModel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DataPackage.FILE__EXT:
        setExt((String)newValue);
        return;
      case DataPackage.FILE__CHANGED:
        setChanged((Boolean)newValue);
        return;
      case DataPackage.FILE__MODEL:
        getModel().clear();
        getModel().addAll((Collection<? extends EObject>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DataPackage.FILE__EXT:
        setExt(EXT_EDEFAULT);
        return;
      case DataPackage.FILE__CHANGED:
        setChanged(CHANGED_EDEFAULT);
        return;
      case DataPackage.FILE__MODEL:
        getModel().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DataPackage.FILE__EXT:
        return EXT_EDEFAULT == null ? ext != null : !EXT_EDEFAULT.equals(ext);
      case DataPackage.FILE__CHANGED:
        return changed != CHANGED_EDEFAULT;
      case DataPackage.FILE__MODEL:
        return model != null && !model.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ext: ");
    result.append(ext);
    result.append(", changed: ");
    result.append(changed);
    result.append(')');
    return result.toString();
  }

} //FileImpl
