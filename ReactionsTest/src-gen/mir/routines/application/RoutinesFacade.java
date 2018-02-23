package mir.routines.application;

import allElementTypes.Root;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
    this.commonFunctions = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("extended.base.commonFunctions")));
  }
  
  public mir.routines.commonFunctions.RoutinesFacade commonFunctions;
  
  public boolean someDummyRoutine() {
    mir.routines.application.RoutinesFacade _routinesFacade = this;
    tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    mir.routines.application.SomeDummyRoutineRoutine routine = new mir.routines.application.SomeDummyRoutineRoutine(_routinesFacade, _reactionExecutionState, _caller);
    return routine.applyRoutine();
  }
  
  public boolean doSth() {
    mir.routines.extended.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("extended")));
    return _routinesFacade.doSth();
  }
  
  public boolean test() {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("extended.base")));
    return _routinesFacade.test();
  }
  
  public boolean test2() {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("extended.base")));
    return _routinesFacade.test2();
  }
  
  public boolean test3(final java.util.List<java.lang.String> list) {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("extended.base")));
    return _routinesFacade.test3(list);
  }
  
  public boolean createRoot(final Root rootElement) {
    mir.routines.base.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("extended.base")));
    return _routinesFacade.createRoot(rootElement);
  }
  
  public boolean baseTest() {
    mir.routines.base2.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base2")));
    return _routinesFacade.baseTest();
  }
  
  public boolean baseTest2() {
    mir.routines.base2.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base2")));
    return _routinesFacade.baseTest2();
  }
  
  public boolean deleteRoot(final Root rootElement) {
    mir.routines.base2.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("base2")));
    return _routinesFacade.deleteRoot(rootElement);
  }
}
