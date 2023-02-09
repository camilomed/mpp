package StudyTestQuest;

@FunctionalInterface
public interface SubPredicate extends Predicate {

	<T> boolean apply(T n);
}
