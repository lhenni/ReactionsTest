package mir.routines.sample2;

import allElementTypes.Root;
import java.io.IOException;
import mir.routines.sample2.RoutinesFacade;
import org.eclipse.emf.ecore.EObject;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class DeleteRootRoutine extends AbstractRepairRoutineRealization {
  private RoutinesFacade actionsFacade;
  
  private DeleteRootRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Root rootElement, final Root oldModel) {
      return oldModel;
    }
    
    public EObject getCorrepondenceSourceOldModel(final Root rootElement) {
      return rootElement;
    }
  }
  
  public DeleteRootRoutine(final AbstractReactionsExecutor executor, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Root rootElement) {
    super(executor, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.sample2.DeleteRootRoutine.ActionUserExecution(getExecutionState(), this);
    this.actionsFacade = executor.createRoutinesFacade("sample2", getExecutionState(), this);
    this.rootElement = rootElement;
  }
  
  private Root rootElement;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine DeleteRootRoutine with input:");
    getLogger().debug("   rootElement: " + this.rootElement);
    
    allElementTypes.Root oldModel = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOldModel(rootElement), // correspondence source supplier
    	allElementTypes.Root.class,
    	(allElementTypes.Root _element) -> true, // correspondence precondition checker
    	null, 
    	true // asserted
    	);
    if (oldModel == null) {
    	return false;
    }
    registerObjectUnderModification(oldModel);
    deleteObject(userExecution.getElement1(rootElement, oldModel));
    
    postprocessElements();
    
    return true;
  }
}
