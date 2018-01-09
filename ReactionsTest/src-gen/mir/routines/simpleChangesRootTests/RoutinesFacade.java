package mir.routines.simpleChangesRootTests;

import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final AbstractReactionsExecutor executor, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(executor, reactionExecutionState, calledBy);
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.simpleChangesRootTests.CreateRootRoutine effect = new mir.routines.simpleChangesRootTests.CreateRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
  
  public boolean test() {
    mir.routines.simpleChangesRootTests.TestRoutine effect = new mir.routines.simpleChangesRootTests.TestRoutine(this.executor, this.executionState, this.calledBy);
    return effect.applyRoutine();
  }
  
  public boolean deleteRoot(final Root rootElement) {
    mir.routines.simpleChangesRootTests.DeleteRootRoutine effect = new mir.routines.simpleChangesRootTests.DeleteRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
}
