package mir.reactions.base;

import allElementTypes.Root;
import mir.routines.base.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionRealization;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.framework.change.echange.EChange;
import tools.vitruv.framework.change.echange.eobject.CreateEObject;
import tools.vitruv.framework.change.echange.root.InsertRootEObject;

@SuppressWarnings("all")
public class CreateRootTest2Reaction extends AbstractReactionRealization {
  private CreateEObject<Root> createChange;
  
  private InsertRootEObject<Root> insertChange;
  
  private int currentlyMatchedChange;
  
  public CreateRootTest2Reaction(final RoutinesFacade routinesFacade) {
    super(routinesFacade);
  }
  
  public void executeReaction(final EChange change) {
    if (!checkPrecondition(change)) {
    	return;
    }
    allElementTypes.Root newValue = insertChange.getNewValue();
    int index = insertChange.getIndex();
    				
    getLogger().trace("Passed complete precondition check of Reaction " + this.getClass().getName());
    				
    mir.reactions.base.CreateRootTest2Reaction.ActionUserExecution userExecution = new mir.reactions.base.CreateRootTest2Reaction.ActionUserExecution(this.executionState, this);
    userExecution.callRoutine1(insertChange, newValue, index, this.getRoutinesFacade());
    
    resetChanges();
  }
  
  private void resetChanges() {
    createChange = null;
    insertChange = null;
    currentlyMatchedChange = 0;
  }
  
  private boolean matchCreateChange(final EChange change) {
    if (change instanceof CreateEObject<?>) {
    	CreateEObject<allElementTypes.Root> _localTypedChange = (CreateEObject<allElementTypes.Root>) change;
    	if (!(_localTypedChange.getAffectedEObject() instanceof allElementTypes.Root)) {
    		return false;
    	}
    	this.createChange = (CreateEObject<allElementTypes.Root>) change;
    	return true;
    }
    
    return false;
  }
  
  public boolean checkPrecondition(final EChange change) {
    if (currentlyMatchedChange == 0) {
    	if (!matchCreateChange(change)) {
    		resetChanges();
    		return false;
    	} else {
    		currentlyMatchedChange++;
    	}
    	return false; // Only proceed on the last of the expected changes
    }
    if (currentlyMatchedChange == 1) {
    	if (!matchInsertChange(change)) {
    		resetChanges();
    		checkPrecondition(change); // Reexecute to potentially register this as first change
    		return false;
    	} else {
    		currentlyMatchedChange++;
    	}
    }
    
    return true;
  }
  
  private boolean matchInsertChange(final EChange change) {
    if (change instanceof InsertRootEObject<?>) {
    	InsertRootEObject<allElementTypes.Root> _localTypedChange = (InsertRootEObject<allElementTypes.Root>) change;
    	if (!(_localTypedChange.getNewValue() instanceof allElementTypes.Root)) {
    		return false;
    	}
    	this.insertChange = (InsertRootEObject<allElementTypes.Root>) change;
    	return true;
    }
    
    return false;
  }
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final InsertRootEObject insertChange, final Root newValue, final int index, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.test2();
    }
  }
}
