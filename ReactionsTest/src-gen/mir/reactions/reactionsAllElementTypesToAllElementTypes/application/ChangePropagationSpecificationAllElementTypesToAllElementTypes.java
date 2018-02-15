package mir.reactions.reactionsAllElementTypesToAllElementTypes.application;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;

@SuppressWarnings("all")
public class ChangePropagationSpecificationAllElementTypesToAllElementTypes extends AbstractReactionsChangePropagationSpecification {
  public ChangePropagationSpecificationAllElementTypesToAllElementTypes() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.reactionsAllElementTypesToAllElementTypes.application.ExecutorAllElementTypesToAllElementTypes());
  }
}
