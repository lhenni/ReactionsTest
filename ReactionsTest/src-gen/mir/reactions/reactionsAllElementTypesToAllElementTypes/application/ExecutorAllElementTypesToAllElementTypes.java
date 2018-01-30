package mir.reactions.reactionsAllElementTypesToAllElementTypes.application;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;

@SuppressWarnings("all")
public class ExecutorAllElementTypesToAllElementTypes extends AbstractReactionsExecutor {
  public ExecutorAllElementTypesToAllElementTypes() {
    super(new tools.vitruv.framework.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.framework.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected RoutinesFacadesProvider createRoutinesFacadesProvider() {
    return new mir.routines.application.RoutinesFacadesProvider();
  }
  
  protected void setup() {
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.base.CreateRootTest2Reaction(this.getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Application.Extended.Base"))));
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.extended.AdditionalCreateRootTestReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Application.Extended"))));
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.base2.DeleteRootTestReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Application.Base2"))));
    this.addReaction(new mir.reactions.reactionsAllElementTypesToAllElementTypes.application.base.CreateRootTestReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath.fromPathString("Application"))));
  }
}
