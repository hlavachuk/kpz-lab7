package Task4;

/** Стабільний контракт: як категорія лікаря впливає на вартість консультації. */
public interface FeePolicy {
    double apply(double baseFee);
    String name();
}
