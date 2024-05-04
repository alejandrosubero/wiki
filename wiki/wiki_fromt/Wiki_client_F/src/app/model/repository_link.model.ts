export class RepositoryLink {

    private _idRepositoryLink: number;
    private _name: string;
    private _repositoryLink: string;

    constructor() {
        this._name = "";
        this._idRepositoryLink = 0;
        this._repositoryLink = "";
    }

    public get idRepositoryLink(): number {
        return this._idRepositoryLink;
    }
    public set idRepositoryLink(value: number) {
        this._idRepositoryLink = value;
    }

    public get name(): string {
        return this._name;
    }
    public set name(value: string) {
        this._name = value;
    }

    public get repositoryLink(): string {
        return this._repositoryLink;
    }
    public set repositoryLink(value: string) {
        this._repositoryLink = value;
    }
    
}