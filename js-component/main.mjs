class X {
    constructor (a) {
        this.a = a;
    }
    getA () {
        return this.a + 200;
    }
    setA (a) {
        this.a = a;
    }
    static add (x, a) {
        x.setA(x.getA() + a);
        return x;
    }
}

export const jsiface = { X }