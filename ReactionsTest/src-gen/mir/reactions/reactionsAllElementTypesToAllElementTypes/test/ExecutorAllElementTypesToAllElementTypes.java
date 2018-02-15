package mir.reactions.reactionsAllElementTypesToAllElementTypes.test;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;

@SuppressWarnings("all")
class ExecutorAllElementTypesToAllElementTypes extends AbstractReactionsExecutor {
  public ExecutorAllElementTypesToAllElementTypes() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected RoutinesFacadesProvider createRoutinesFacadesProvider() {
    return new mir.routines.test.RoutinesFacadesProvider();
  }
  
  protected void setup() {
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.base.CreateRootTest2Reaction(this.getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("test.extended.base"))));
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.extended.AdditionalCreateRootTestReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("test.extended"))));
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.extended.base.CreateRootTestReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("test.extended"))));
  }
}