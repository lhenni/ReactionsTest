package mir.routines.base2;

import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
    this.CommonFunctions = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base2.CommonFunctions"));
  }
  
  public mir.routines.commonFunctions.RoutinesFacade CommonFunctions;
  
  public boolean baseTest() {
    mir.routines.base2.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base2"));
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.base2.BaseTestRoutine routine = new mir.routines.base2.BaseTestRoutine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean baseTest2() {
    mir.routines.base2.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base2"));
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.base2.BaseTest2Routine routine = new mir.routines.base2.BaseTest2Routine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean deleteRoot(final Root rootElement) {
    mir.routines.base2.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Base2"));
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.base2.DeleteRootRoutine routine = new mir.routines.base2.DeleteRootRoutine(_routinesFacade, _reactionExecutionState, _caller, rootElement);
    return routine.applyRoutine();
  }
}
