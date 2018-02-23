package mir.routines.subSegment;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
    this.extended = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("extended")));
  }
  
  public mir.routines.extended.RoutinesFacade extended;
  
  public boolean doSth() {
    mir.routines.subSegment.RoutinesFacade _routinesFacade = this;
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.subSegment.DoSthRoutine routine = new mir.routines.subSegment.DoSthRoutine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
}
