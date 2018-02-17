package mir.reactions.application;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;

@SuppressWarnings("all")
public class ApplicationChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification {
  public ApplicationChangePropagationSpecification() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.application.ReactionsExecutor());
  }
}