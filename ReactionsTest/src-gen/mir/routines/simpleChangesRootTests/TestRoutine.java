package mir.routines.simpleChangesRootTests;

import java.io.IOException;
import mir.routines.simpleChangesRootTests.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class TestRoutine extends AbstractRepairRoutineRealization {
  private RoutinesFacade actionsFacade;
  
  private TestRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(@Extension final RoutinesFacade _routinesFacade) {
      System.out.println("test2");
    }
  }
  
  public TestRoutine(final AbstractReactionsExecutor executor, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
    super(executor, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.simpleChangesRootTests.TestRoutine.ActionUserExecution(getExecutionState(), this);
    this.actionsFacade = executor.createRoutinesFacade("simpleChangesRootTests", getExecutionState(), this);
  }
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine TestRoutine with input:");
    
    userExecution.callRoutine1(actionsFacade);
    
    postprocessElements();
    
    return true;
  }
}