package mir.routines.extended.base.commonFunctions;

import java.io.IOException;
import mir.routines.extended.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class Func1Routine extends AbstractRepairRoutineRealization {
  private Func1Routine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final String string, @Extension final RoutinesFacade _routinesFacade) {
      System.out.println(("func1 overridden by Extended: " + string));
    }
  }
  
  public Func1Routine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final String string) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.extended.base.commonFunctions.Func1Routine.ActionUserExecution(getExecutionState(), this);
    this.string = string;
  }
  
  private String string;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine Func1Routine with input:");
    getLogger().debug("   string: " + this.string);
    
    userExecution.callRoutine1(string, this.getRoutinesFacade());
    
    postprocessElements();
    
    return true;
  }
}
