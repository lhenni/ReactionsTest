package mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesRootTests;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ExecutorAllElementTypesToAllElementTypes extends AbstractReactionsExecutor {
  public ExecutorAllElementTypesToAllElementTypes() {
    super(new tools.vitruv.framework.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.framework.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesRootTests.CreateRootTestReaction(this));
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesRootTests.DeleteRootTestReaction(this));
  }
  
  public <T extends AbstractRepairRoutinesFacade> T createRoutinesFacade(final String reactionsSegmentName, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    switch(reactionsSegmentName) {
    	case "simpleChangesRootTests": {
    		return (T) new mir.routines.simpleChangesRootTests.RoutinesFacade(this, reactionExecutionState, calledBy);
    	}
    	default: {
    		throw new IllegalArgumentException("Unexpected reactions segment name: " + reactionsSegmentName);
    	}
    }
  }
}
