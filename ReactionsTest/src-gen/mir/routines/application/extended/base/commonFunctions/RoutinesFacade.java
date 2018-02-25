package mir.routines.application.extended.base.commonFunctions;

import mir.routines.application.extended.base.commonFunctions.Func3Routine;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends mir.routines.extended.base.commonFunctions.RoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
  }
  
  public boolean func3() {
    mir.routines.application.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().subPathTo("application"));
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    Func3Routine routine = new Func3Routine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
}
