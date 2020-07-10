package org.treblereel.gwt.jackson.definition;

import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import org.treblereel.gwt.jackson.context.GenerationContext;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 4/1/20
 */
public class BasicTypeFieldDefinition extends FieldDefinition {

    protected BasicTypeFieldDefinition(TypeMirror property, GenerationContext context) {
        super(property, context);
    }

    @Override
    public Expression getFieldDeserializer(PropertyDefinition field, CompilationUnit cu) {
        return new MethodCallExpr(
                new NameExpr(context.getTypeRegistry()
                                     .getDeserializer(bean).toString()), "getInstance");
    }

    @Override
    public Expression getFieldSerializer(PropertyDefinition field, CompilationUnit cu) {
        MethodCallExpr method = new MethodCallExpr(
                new NameExpr(context.getTypeRegistry()
                                     .getSerializer(context.getProcessingEnv()
                                                            .getTypeUtils()
                                                            .erasure(getBean()))
                                     .toString()), "getInstance");
        if (getBean().getKind().equals(TypeKind.ARRAY)) {
            method.addArgument(new StringLiteralExpr(field.getPropertyName()));
        }
        return method;
    }

    @Override
    public String toString() {
        return "BasicTypeFieldDefinition{" +
                "bean=" + bean +
                '}';
    }
}
