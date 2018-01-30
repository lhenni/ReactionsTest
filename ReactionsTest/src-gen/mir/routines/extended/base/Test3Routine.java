package mir.routines.extended.base;

import java.io.IOException;
import mir.routines.extended.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class Test3Routine extends AbstractRepairRoutineRealization {
  private Test3Routine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final java.util.List<java.lang.String> s, @Extension final RoutinesFacade _routinesFacade) {
      String _plus = ("overridden test3 with parameter " + s);
      System.out.println(_plus);
    }
  }
  
  public Test3Routine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final java.util.List<java.lang.String> s) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.extended.base.Test3Routine.ActionUserExecution(getExecutionState(), this);
    this.s = s;
  }
  
  private java.util.List<java.lang.String> s;
  
  protected boolean executeRoutine() throws IOException {
    getLogger().debug("Called routine Test3Routine with input:");
    getLogger().debug("   s: " + this.s);
    
    userExecution.callRoutine1(s, this.getRoutinesFacade());
    
    postprocessElements();
    
    return true;
  }
}
