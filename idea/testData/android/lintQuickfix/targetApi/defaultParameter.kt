// INTENTION_TEXT: Add @TargetApi(LOLLIPOP) Annotation
// INSPECTION_CLASS: org.jetbrains.android.inspections.lint.AndroidLintInspectionToolProvider$AndroidLintNewApiInspection

import android.graphics.drawable.VectorDrawable


fun withDefaultParameter(vector: VectorDrawable = <caret>VectorDrawable()) {

}