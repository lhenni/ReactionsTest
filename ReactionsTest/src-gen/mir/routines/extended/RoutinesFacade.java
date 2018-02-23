package mir.routines.extended;

import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
    this.commonFunctions = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base.commonFunctions")));
  }
  
  public mir.routines.commonFunctions.RoutinesFacade commonFunctions;
  
  public boolean doSth() {
    mir.routines.extended.RoutinesFacade _routinesFacade = this;
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.extended.DoSthRoutine routine = new mir.routines.extended.DoSthRoutine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean test() {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base")));
    return _routinesFacade.test();
  }
  
  public boolean test2() {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base")));
    return _routinesFacade.test2();
  }
  
  public boolean test3(final java.util.List<java.lang.String> list) {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base")));
    return _routinesFacade.test3(list);
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base")));
    return _routinesFacade.createRoot(rootElement);
  }
}
