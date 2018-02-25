package mir.routines.simpleChangesRootTests;

import allElementTypes.Root;
import mir.routines.simpleChangesRootTests.CreateRootRoutine;
import mir.routines.simpleChangesRootTests.DeleteRootRoutine;
import mir.routines.simpleChangesRootTests.TestRoutine;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
  }
  
  public boolean createRoot(final Root rootElement) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateRootRoutine routine = new CreateRootRoutine(_routinesFacade, _reactionExecutionState, _caller, rootElement);
    return routine.applyRoutine();
  }
  
  public boolean test() {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    TestRoutine routine = new TestRoutine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean deleteRoot(final Root rootElement) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DeleteRootRoutine routine = new DeleteRootRoutine(_routinesFacade, _reactionExecutionState, _caller, rootElement);
    return routine.applyRoutine();
  }
}
