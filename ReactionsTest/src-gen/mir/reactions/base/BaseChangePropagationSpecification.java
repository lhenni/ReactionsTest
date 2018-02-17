package mir.reactions.base;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;

@SuppressWarnings("all")
public class BaseChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification {
  public BaseChangePropagationSpecification() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.base.ReactionsExecutor());
  }
}
