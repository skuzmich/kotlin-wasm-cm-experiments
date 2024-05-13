export class X {
    constructor (a) {
        this.a = a;
    }
    getA () {
        return this.a;
    }
    setA (a) {
        this.a = a;
    }
    static add (x, a) {
        x.setA(x.getA() + a);
        return x;
    }
}