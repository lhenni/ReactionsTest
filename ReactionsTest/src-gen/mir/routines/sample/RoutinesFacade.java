package mir.routines.sample;

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
  
  public boolean test() {
    mir.routines.sample.TestRoutine effect = new mir.routines.sample.TestRoutine(this.executor, this.executionState, this.calledBy);
    return effect.applyRoutine();
  }
  
  public boolean test2() {
    mir.routines.sample.Test2Routine effect = new mir.routines.sample.Test2Routine(this.executor, this.executionState, this.calledBy);
    return effect.applyRoutine();
  }
  
  public boolean deleteRoot(final Root rootElement) {
    mir.routines.sample.DeleteRootRoutine effect = new mir.routines.sample.DeleteRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.sample.CreateRootRoutine effect = new mir.routines.sample.CreateRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
}
