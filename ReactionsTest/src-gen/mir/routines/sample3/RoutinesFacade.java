package mir.routines.sample3;

import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final AbstractReactionsExecutor executor, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(executor, reactionExecutionState, calledBy);
    this.sample2 = executor.createRoutinesFacade("sample2", reactionExecutionState, calledBy);
    this.sample = executor.createRoutinesFacade("sample", reactionExecutionState, calledBy);
  }
  
  public mir.routines.sample3.sample2.RoutinesFacade sample2;
  
  public mir.routines.sample3.sample.RoutinesFacade sample;
  
  public boolean test() {
    mir.routines.sample3.TestRoutine effect = new mir.routines.sample3.TestRoutine(this.executor, this.executionState, this.calledBy);
    return effect.applyRoutine();
  }
  
  public boolean deleteRoot(final Root rootElement) {
    mir.routines.sample3.DeleteRootRoutine effect = new mir.routines.sample3.DeleteRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.sample3.CreateRootRoutine effect = new mir.routines.sample3.CreateRootRoutine(this.executor, this.executionState, this.calledBy, rootElement);
    return effect.applyRoutine();
  }
}
