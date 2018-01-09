package mir.routines.sample2.sample;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RoutinesFacade extends mir.routines.sample.RoutinesFacade {
  public RoutinesFacade(final AbstractReactionsExecutor executor, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(executor, reactionExecutionState, calledBy);
  }
  
  public boolean test() {
    mir.routines.sample2.sample.TestRoutine effect = new mir.routines.sample2.sample.TestRoutine(this.executor, this.executionState, this.calledBy);
    return effect.applyRoutine();
  }
}
