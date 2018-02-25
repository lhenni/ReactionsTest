package mir.routines.extended.base;

import allElementTypes.Root;
import mir.routines.extended.base.CreateRootRoutine;
import mir.routines.extended.base.Test3Routine;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends mir.routines.base.RoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
  }
  
  public boolean test3(final java.util.List<java.lang.String> s) {
    mir.routines.extended.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().subPathTo("extended"));
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    Test3Routine routine = new Test3Routine(_routinesFacade, _reactionExecutionState, _caller, s);
    return routine.applyRoutine();
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.extended.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().subPathTo("extended"));
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateRootRoutine routine = new CreateRootRoutine(_routinesFacade, _reactionExecutionState, _caller, rootElement);
    return routine.applyRoutine();
  }
}
