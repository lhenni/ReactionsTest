package mir.reactions.base2;

import allElementTypes.Root;
import mir.routines.base2.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionRealization;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.framework.change.echange.EChange;
import tools.vitruv.framework.change.echange.eobject.DeleteEObject;
import tools.vitruv.framework.change.echange.root.RemoveRootEObject;

@SuppressWarnings("all")
public class DeleteRootTestReaction extends AbstractReactionRealization {
  private RemoveRootEObject<Root> removeChange;
  
  private DeleteEObject<Root> deleteChange;
  
  private int currentlyMatchedChange;
  
  public DeleteRootTestReaction(final RoutinesFacade routinesFacade) {
    super(routinesFacade);
  }
  
  public void executeReaction(final EChange change) {
    if (!checkPrecondition(change)) {
    	return;
    }
    allElementTypes.Root oldValue = removeChange.getOldValue();
    int index = removeChange.getIndex();
    				
    getLogger().trace("Passed complete precondition check of Reaction " + this.getClass().getName());
    				
    mir.reactions.base2.DeleteRootTestReaction.ActionUserExecution userExecution = new mir.reactions.base2.DeleteRootTestReaction.ActionUserExecution(this.executionState, this);
    userExecution.callRoutine1(removeChange, oldValue, index, this.getRoutinesFacade());
    
    resetChanges();
  }
  
  private boolean matchDeleteChange(final EChange change) {
    if (change instanceof DeleteEObject<?>) {
    	DeleteEObject<allElementTypes.Root> _localTypedChange = (DeleteEObject<allElementTypes.Root>) change;
    	if (!(_localTypedChange.getAffectedEObject() instanceof allElementTypes.Root)) {
    		return false;
    	}
    	this.deleteChange = (DeleteEObject<allElementTypes.Root>) change;
    	return true;
    }
    
    return false;
  }
  
  private void resetChanges() {
    removeChange = null;
    deleteChange = null;
    currentlyMatchedChange = 0;
  }
  
  private boolean matchRemoveChange(final EChange change) {
    if (change instanceof RemoveRootEObject<?>) {
    	RemoveRootEObject<allElementTypes.Root> _localTypedChange = (RemoveRootEObject<allElementTypes.Root>) change;
    	if (!(_localTypedChange.getOldValue() instanceof allElementTypes.Root)) {
    		return false;
    	}
    	this.removeChange = (RemoveRootEObject<allElementTypes.Root>) change;
    	return true;
    }
    
    return false;
  }
  
  public boolean checkPrecondition(final EChange change) {
    if (currentlyMatchedChange == 0) {
    	if (!matchRemoveChange(change)) {
    		resetChanges();
    		return false;
    	} else {
    		currentlyMatchedChange++;
    	}
    	return false; // Only proceed on the last of the expected changes
    }
    if (currentlyMatchedChange == 1) {
    	if (!matchDeleteChange(change)) {
    		resetChanges();
    		checkPrecondition(change); // Reexecute to potentially register this as first change
    		return false;
    	} else {
    		currentlyMatchedChange++;
    	}
    }
    
    return true;
  }
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final RemoveRootEObject removeChange, final Root oldValue, final int index, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.deleteRoot(oldValue);
    }
  }
}
