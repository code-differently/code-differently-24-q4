import { logger } from '@/util/server-logger';

export async function POST(request: Request) {
  const batch = await request.json();
  for (const log of batch) {
    const { level, message, vars } = log;
    logger.log(level, message, { ...(vars || {}) });
  }
  return new Response(null, { status: 204 });
}
