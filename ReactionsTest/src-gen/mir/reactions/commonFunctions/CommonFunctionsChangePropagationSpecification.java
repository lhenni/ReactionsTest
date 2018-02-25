package mir.reactions.commonFunctions;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;
import tools.vitruv.framework.change.processing.ChangePropagationSpecification;

@SuppressWarnings("all")
public class CommonFunctionsChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification implements ChangePropagationSpecification {
  public CommonFunctionsChangePropagationSpecification() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.commonFunctions.ReactionsExecutor());
  }
}
