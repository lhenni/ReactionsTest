package mir.reactions.base2;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;

@SuppressWarnings("all")
public class Base2ChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification {
  public Base2ChangePropagationSpecification() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.base2.ReactionsExecutor());
  }
}
