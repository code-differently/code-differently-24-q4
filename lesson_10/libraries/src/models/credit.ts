import { Role } from './role.js';

export class Credit {
  mediaItemId: string;
  name: string;
  role: Role;

  constructor(mediaItemId: string, name: string, role: Role) {
    this.mediaItemId = mediaItemId;
    this.name = name;
    this.role = role;
  }
}
