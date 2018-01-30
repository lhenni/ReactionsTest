package mir.routines.base;

import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
    this.CommonFunctions = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base.CommonFunctions"));
  }
  
  public mir.routines.commonFunctions.RoutinesFacade CommonFunctions;
  
  public boolean test() {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base"));
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.base.TestRoutine routine = new mir.routines.base.TestRoutine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean test2() {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base"));
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.base.Test2Routine routine = new mir.routines.base.Test2Routine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base"));
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.base.CreateRootRoutine routine = new mir.routines.base.CreateRootRoutine(_routinesFacade, _reactionExecutionState, _caller, rootElement);
    return routine.applyRoutine();
  }
}
