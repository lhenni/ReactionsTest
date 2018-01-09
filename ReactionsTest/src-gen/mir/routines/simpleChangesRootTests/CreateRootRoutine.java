package mir.routines.simpleChangesRootTests;

import allElementTypes.Root;
import java.io.IOException;
import mir.routines.simpleChangesRootTests.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateRootRoutine extends AbstractRepairRoutineRealization {
  private RoutinesFacade actionsFacade;
  
  private CreateRootRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Root rootElement, final Root newRoot) {
      return newRoot;
    }
    
    public void updateNewRootElement(final Root rootElement, final Root newRoot) {
      newRoot.setId(rootElement.getId());
    }
    
    public EObject getElement2(final Root rootElement, final Root newRoot) {
      return rootElement;
    }
    
    public void callRoutine1(final Root rootElement, final Root newRoot, @Extension final RoutinesFacade _routinesFacade) {
      String _replace = rootElement.getId().replace("Source", "Target");
      String _plus = ("model/" + _replace);
      String _plus_1 = (_plus + ".");
      String _fileExtension = rootElement.eResource().getURI().fileExtension();
      String _plus_2 = (_plus_1 + _fileExtension);
      this.persistProjectRelative(rootElement, newRoot, _plus_2);
      _routinesFacade.test();
    }
  }
  
  public CreateRootRoutine(final AbstractReactionsExecutor executor, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Root rootElement) {
    super(executor, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.simpleChangesRootTests.CreateRootRoutine.ActionUserExecution(getExecutionState(), this);
    this.actionsFacade = executor.createRoutinesFacade("simpleChangesRootTests", getExecutionState(), this);
    this.rootElement = rootElement;
  }
  
  private Root rootElement;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine CreateRootRoutine with input:");
    getLogger().debug("   rootElement: " + this.rootElement);
    
    allElementTypes.Root newRoot = allElementTypes.impl.AllElementTypesFactoryImpl.eINSTANCE.createRoot();
    notifyObjectCreated(newRoot);
    userExecution.updateNewRootElement(rootElement, newRoot);
    
    addCorrespondenceBetween(userExecution.getElement1(rootElement, newRoot), userExecution.getElement2(rootElement, newRoot), "");
    
    userExecution.callRoutine1(rootElement, newRoot, actionsFacade);
    
    postprocessElements();
    
    return true;
  }
}
