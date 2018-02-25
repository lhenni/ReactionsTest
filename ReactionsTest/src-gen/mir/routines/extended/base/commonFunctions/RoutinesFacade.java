package mir.routines.extended.base.commonFunctions;

import mir.routines.extended.base.commonFunctions.Func1Routine;
import mir.routines.extended.base.commonFunctions.Func3Routine;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends mir.routines.commonFunctions.RoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
  }
  
  public boolean func3() {
    mir.routines.extended.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().subPathTo("extended"));
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    Func3Routine routine = new Func3Routine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean func1(final String string) {
    mir.routines.extended.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().subPathTo("extended"));
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    Func1Routine routine = new Func1Routine(_routinesFacade, _reactionExecutionState, _caller, string);
    return routine.applyRoutine();
  }
}
