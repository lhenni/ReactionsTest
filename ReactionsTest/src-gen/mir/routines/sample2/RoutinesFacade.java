package mir.routines.sample2;

import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final AbstractReactionsExecutor executor, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(executor, reactionExecutionState, calledBy);
    this.sample = executor.createRoutinesFacade("sample", reactionExecutionState, calledBy);
  }
  
  public mir.routines.sample2.sample.RoutinesFacade sample;
  
  public boolean test() {
    mir.routines.sample2.TestRoutine effect = new mir.routines.sample2.TestRoutine(this.executor, this.executionState, this.calledBy);
    return effect.applyRoutine();
  }
  
  public boolean test123() {
    mir.routines.sample2.Test123Routine effect = new mir.routines.sample2.Test123Routine(this.executor, this.executionState, this.calledBy);
    return effect.applyRoutine();
  }
  
  public boolean deleteRoot(final Root rootElement) {
    mir.routines.sample2.DeleteRootRoutine effect = new mir.routines.sample2.DeleteRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.sample2.CreateRootRoutine effect = new mir.routines.sample2.CreateRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
}
