export class DocumentDTOModel {

    private _titleD: string;
    private _packageD: string;
    private _typeD: string;
    private _injectD: string;
    private _extendsD: string;
    private _implementsD: string;
    private _useD: string;

    private _descriptionD!: string;


    constructor() {
        this._titleD = "";
        this._packageD = "";
        this._typeD = "";
        this._injectD = "";
        this._extendsD = "";
        this._implementsD = "";
        this._useD = "";
        this._descriptionD = "";
    }

    public get descriptionD(): string {
        return this._descriptionD;
    }
    public set descriptionD(value: string) {
        this._descriptionD = value;
    }

    public get useD(): string {
        return this._useD;
    }
    public set useD(value: string) {
        this._useD = value;
    }

    public get implementsD(): string {
        return this._implementsD;
    }
    public set implementsD(value: string) {
        this._implementsD = value;
    }

    public get packageD(): string {
        return this._packageD;
    }
    public set packageD(value: string) {
        this._packageD = value;
    }
    public get titleD(): string {
        return this._titleD;
    }
    public set titleD(value: string) {
        this._titleD = value;
    }
    public get typeD(): string {
        return this._typeD;
    }
    public set typeD(value: string) {
        this._typeD = value;
    }

    public get injectD(): string {
        return this._injectD;
    }
    public set injectD(value: string) {
        this._injectD = value;
    }
    public get extendsD(): string {
        return this._extendsD;
    }
    public set extendsD(value: string) {
        this._extendsD = value;
    }


}