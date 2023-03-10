package com.tabnine.statusBar;

import static com.tabnine.general.DependencyContainer.instanceOfBinaryRequestFacade;
import static com.tabnine.general.DependencyContainer.instanceOfGlobalActionVisitor;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.StatusBarWidgetProvider;
import com.tabnine.binary.BinaryRequestFacade;
import com.tabnine.lifecycle.BinaryInstantiatedActions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StatusBarPromotionProvider implements StatusBarWidgetProvider {
  private final BinaryRequestFacade binaryRequestFacade = instanceOfBinaryRequestFacade();
  private final BinaryInstantiatedActions actionVisitor = instanceOfGlobalActionVisitor();

  @Nullable
  @Override
  public com.intellij.openapi.wm.StatusBarWidget getWidget(@NotNull Project project) {
    return new StatusBarPromotionWidget(project, binaryRequestFacade, actionVisitor);
  }

  @NotNull
  @Override
  public String getAnchor() {
    return StatusBar.Anchors.after(TabnineStatusBarWidget.class.getName());
  }
}
